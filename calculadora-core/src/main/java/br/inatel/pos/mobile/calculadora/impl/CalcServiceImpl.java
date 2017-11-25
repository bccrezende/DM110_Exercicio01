package br.inatel.pos.mobile.calculadora.impl;

import br.inatel.pos.mobile.calculadora.api.CalcService;
import br.inatel.pos.mobile.calculadora.api.Result;

public class CalcServiceImpl implements CalcService {

	@Override
	public Result buildMessage(int first, int second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(first + second);
		return result;	
	}

	@Override
	public Result buildMessage1(int first, int second) {
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(first - second);
		return result;	
	}

}
