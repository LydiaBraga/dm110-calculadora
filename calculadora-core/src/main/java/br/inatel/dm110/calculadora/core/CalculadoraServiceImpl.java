package br.inatel.dm110.calculadora.core;

import br.inatel.dm110.calculadora.api.CalculadoraService;
import br.inatel.dm110.calculadora.model.Result;

public class CalculadoraServiceImpl implements CalculadoraService {

	@Override
	public Result sum(int first, int last) {
		Result result = new Result();
		result.setFirst(first);
		result.setLast(last);
		result.setResult(first + last); 
		
		return result;
	}

	@Override
	public Result message(int first, int last) {
		Result result = new Result();
		result.setFirst(first);
		result.setLast(last);
		result.setResult(first - last); 
		
		return result;
	}

}
