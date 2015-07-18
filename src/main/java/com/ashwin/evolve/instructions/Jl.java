package com.ashwin.evolve.instructions;

import com.ashwin.evolve.Operand;
import com.ashwin.evolve.exceptions.ExecutionException;
import com.ashwin.evolve.operands.ImmediateOperand;

public class Jl extends Jmp {

	private Operand _src, _dest;
	
	public Jl(ImmediateOperand lines, Operand src, Operand dest) {
		super(lines);
		_src = src;
		_dest = dest;
	}
	
	@Override
	public int execute() throws ExecutionException {
		if(_src.get() < _dest.get())
			return super.execute();
		return 1;
	}
	
	@Override
	public String toString() {
		return "jl " + getLines() + ", " + _src + ", " + _dest;
	}
	
}
