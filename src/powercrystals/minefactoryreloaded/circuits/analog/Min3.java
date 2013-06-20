package powercrystals.minefactoryreloaded.circuits.analog;

import powercrystals.minefactoryreloaded.api.rednet.IRedNetLogicCircuit;
import powercrystals.minefactoryreloaded.circuits.base.StatelessCircuit;

public class Min3 extends StatelessCircuit implements IRedNetLogicCircuit
{
	@Override
	public int getInputCount()
	{
		return 3;
	}
	
	@Override
	public int getOutputCount()
	{
		return 1;
	}
	
	@Override
	public int[] recalculateOutputValues(long worldTime, int[] inputValues)
	{
		return new int[] { Math.min(Math.min(inputValues[0], inputValues[1]), inputValues[2]) };
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return "circuit.mfr.min.3";
	}
	
	@Override
	public String getInputPinLabel(int pin)
	{
		return "I" + pin;
	}
	
	@Override
	public String getOutputPinLabel(int pin)
	{
		return "O";
	}
}
