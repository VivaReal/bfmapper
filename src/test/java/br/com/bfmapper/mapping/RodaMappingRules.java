package br.com.bfmapper.mapping;

import br.com.bfmapper.Converter;
import br.com.bfmapper.MappingRules;
import br.com.bfmapper.RulesMapper;
import br.com.bfmapper.model.Roda;
import br.com.bfmapper.model.RodaCanonico;

public class RodaMappingRules implements RulesMapper {

	@Override
	public void loadRules() {
		MappingRules.addRule(new Converter(Roda.class, RodaCanonico.class));
	}

}
