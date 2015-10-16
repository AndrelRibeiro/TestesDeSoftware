package br.sceweb.teste;


import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
static EmpresaDAO empresaDAO;
static Empresa empresa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO=new  EmpresaDAO();
		empresa=new Empresa();
	}
    @Test
    public void CT01UC01FBCadastra_empresa_com_sucesso(){
	assertEquals(1,empresaDAO.adiciona(empresa));
}/*
    public void CT02UC01A1Cadastra_empresa_cnpj_cadastrado(){
    	
    }
public void CT03UC01A2Cadastra_empresa_cnpj_invalido(){
    	
    }
public void CT04UC01A3Cadastra_empresa_com_dados_invalidos(){
	
}*/
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
