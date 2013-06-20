package powercrystals.minefactoryreloaded.circuits;

import powercrystals.minefactoryreloaded.api.rednet.IRedNetLogicCircuit;
import powercrystals.minefactoryreloaded.circuits.base.StatelessCircuit;

public class Fanout extends StatelessCircuit implements IRedNetLogicCircuit
{
	@Override
	public int getInputCount()
	{
		return 1;
	}
	
	@Override
	public int getOutputCount()
	{
		return 16;
	}
	
	@Override
	public int[] recalculateOutputValues(long worldTime, int[] inputValues)
	{
		return new int[] { inputValues[0], inputValues[0], inputValues[0], inputValues[0], inputValues[0], inputValues[0], inputValues[0], inputValues[0],
				inputValues[0], inputValues[0], inputValues[0], inputValues[0], inputValues[0], inputValues[0], inputValues[0], inputValues[0]};
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return "circuit.mfr.fanout";
	}
	
	@Override
	public String getInputPinLabel(int pin)
	{
		return "I";
	}
	
	@Override
	public String getOutputPinLabel(int pin)
	{
		return "O" + pin;
	}
}
