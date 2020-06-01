package FactoryMethod.ex2_2;

public abstract class MostrarProvedor {
	
	public void mostrar (){
		Informacao info = getInformacao();
		String msg = info.informacao();
		System.out.println(msg);				
	}
	
	protected abstract Informacao getInformacao();
}