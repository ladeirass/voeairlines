package br.com.voeairlines.bo;

public interface IValidacaoEmbarque {

public abstract void validaIdade();
 
public static final int IDADEMIN = 18;
  
public abstract String validaIdade(int idade) ;

}
