package com.example.defer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

public class TestDeferSelectorImpl implements DeferredImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		List<String> configurations = SpringFactoriesLoader.loadFactoryNames(TestDeferSelector.class, null);
		return StringUtils.toStringArray(configurations);
	}

	@Override
	public Class<? extends Group> getImportGroup() {
		return TestDeferSelectorGroup.class;
	}

	//must be static class, no need a reference to the outer class!!!!
	private static class TestDeferSelectorGroup implements Group {

		private final Map<String, AnnotationMetadata> entries = new LinkedHashMap<>();

		@Override
		public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
			String[] imports = selector.selectImports(metadata);
			for (String importClassName : imports) {
				this.entries.put(importClassName, metadata);
			}
		}

		@Override
		public Iterable<Entry> selectImports() {
			return this.entries.keySet().stream()
					.map((importClassName) -> new Entry(this.entries.get(importClassName), importClassName))
					.collect(Collectors.toList());
		}

	}
}
