package io.cucumber.camila;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;
import io.cucumber.camila.configuracao.Configuracao;

public class TesteTricentisSteps {
	public WebDriver browser;
	
	@Dado("que estou no site {string}")
	public void que_estou_no_site(String string) {
	    Configuracao.abrir("http://sampleapp.tricentis.com/101/app.php");
	}

	@Dado("clico no campo make escolho a marca da moto {string}")
	public void clico_no_campo_make_escolho_a_marca_da_moto(String string) {
	    Configuracao.seletorQueryCss("#make").sendKeys(string);
	}

	@Dado("clico no campo model escolho o modelo da moto {string}")
	public void clico_no_campo_model_escolho_o_modelo_da_moto(String string) {
		Configuracao.seletorQueryCss("#model").sendKeys(string);
	}

	@Dado("clico no campo Cylinder Capacity preencho a capacidade do cilindro da moto {string}")
	public void clico_no_campo_Cylinder_Capacity_preencho_a_capacidade_do_cilindro_da_moto(String string) {
	    Configuracao.seletorQueryCss("#cylindercapacity").sendKeys(string);;
	}

	@Dado("clico no campo enginer Performance preencho a capacidade do motor em KW {string}")
	public void clico_no_campo_enginer_Performance_preencho_a_capacidade_do_motor_em_KW(String string) {
	    Configuracao.seletorQueryCss("#engineperformance").sendKeys(string);
	}

	@Dado("clico no campo Date of Maufacture preencho a data de fabricacao da moto {string}")
	public void clico_no_campo_Date_of_Maufacture_preencho_a_data_de_fabricacao_da_moto(String string) {
	    Configuracao.seletorQueryCss("#dateofmanufacture").sendKeys(string);
	}
	
	@Dado("clico no campo Number of Seats e escolho o numero de assentos que a moto tem {string}")
	public void clico_no_campo_Number_of_Seats_e_escolho_o_numero_de_assentos_que_a_moto_tem(String string) {
	    Configuracao.seletorQueryCss("#numberofseats").sendKeys(string);
	}
	
	@Dado("escolho o botao Right Hand Driver para indicar o tipo motorista de mao direita")
	public void escolho_o_botao_Right_Hand_Driver_para_indicar_o_tipo_motorista_de_mao_direita() {
	   Configuracao.seletorQueryCss(".ideal-radiocheck-label").click();
	}

	@Dado("clico na nova opcao Number of Seats escolho mais uma vez o numero de assentos na moto {string}")
	public void clico_na_nova_opcao_Number_of_Seats_escolho_mais_uma_vez_o_numero_de_assentos_na_moto(String string) {
	    Configuracao.seletorQueryCss("#numberofseatsmotorcycle").sendKeys(string);
	}

	@Dado("clico no campo Fuel Type devo escolher o tipo de combustivel usado na moto {string}")
	public void clico_no_campo_Fuel_Type_devo_escolher_o_tipo_de_combustivel_usado_na_moto(String string) {
	   Configuracao.seletorQueryCss("#fuel").sendKeys(string);
	}

	@Dado("clico no campo Payload digito a carga util de combustivel na moto {string}")
	public void clico_no_campo_Payload_digito_a_carga_util_de_combustivel_na_moto(String string) {
	    Configuracao.seletorQueryCss("#payload").sendKeys(string);
	}

	@Dado("clico no campo Total Wight digito o peso total da moto {string}")
	public void clico_no_campo_Total_Wight_digito_o_peso_total_da_moto(String string) {
	    Configuracao.seletorQueryCss("#totalweight").sendKeys(string);
	}

	@Dado("clico no campo List Price digito o valor da moto {string}")
	public void clico_no_campo_List_Price_digito_o_valor_da_moto(String string) {
		Configuracao.seletorQueryCss("#listprice").sendKeys(string);
	}

	@Dado("clico no campo License Plate Number digito a placa da moto {string}")
	public void clico_no_campo_License_Plate_Number_digito_a_placa_da_moto(String string) {
	    Configuracao.seletorQueryCss("#licenseplatenumber").sendKeys(string);
	}

	@Dado("clico no campo Annual Mileage digito a quilometragem anual da moto {string}")
	public void clico_no_campo_Annual_Mileage_digito_a_quilometragem_anual_da_moto(String string) {
	    Configuracao.seletorQueryCss("#annualmileage").sendKeys(string);
	}

	@Dado("clico no botao next que encaminha para a aba enter insurant data")
	public void clico_no_botao_next_que_encaminha_para_a_aba_enter_insurant_data() {
	    Configuracao.seletorQueryCss("#nextenterinsurantdata").click();
	}

	@Dado("clico no campo First Name preencho meu primeiro nome {string}")
	public void clico_no_campo_First_Name_preencho_meu_primeiro_nome(String string) {
	    Configuracao.seletorQueryCss("#firstname").sendKeys(string);
	}

	@Dado("clico no campo Last name preencho o meu sobrenome {string}")
	public void clico_no_campo_Last_name_preencho_o_meu_sobrenome(String string) {
	    Configuracao.seletorQueryCss("#lastname").sendKeys(string);
	}

	@Dado("clico no campo Date of Birth preench a minha data de nascimento {string}")
	public void clico_no_campo_Date_of_Birth_preench_a_minha_data_de_nascimento(String string) {
	    Configuracao.seletorQueryCss("#birthdate").sendKeys(string);
	}

	@Dado("escolho no botao opcao de genero na parte Gender")
	public void escolho_no_botao_opcao_de_genero_na_parte_Gender() {
	    Configuracao.seletorQueryCss("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span").click();
	}

	@Dado("clico no campo Street Address preencho meu endereco {string}")
	public void clico_no_campo_Street_Address_preencho_meu_endereco(String string) {
	    Configuracao.seletorQueryCss("#streetaddress").sendKeys(string);
	}

	@Dado("clico no campo Country e escolho o meu pais {string}")
	public void clico_no_campo_Country_e_escolho_o_meu_pais(String string) {
	    Configuracao.seletorQueryCss("#country").sendKeys(string);
	}

	@Dado("clico no campo zip code e digito meu CEP {string}")
	public void clico_no_campo_zip_code_e_digito_meu_CEP(String string) {
		Configuracao.seletorQueryCss("#zipcode").sendKeys(string);
	}

	@Dado("clico no campo city e digito a minha cidade {string}")
	public void clico_no_campo_city_e_digito_a_minha_cidade(String string) {
	    Configuracao.seletorQueryCss("#city").sendKeys(string);
	}

	@Dado("clico no campo Occupation seleciono a minha ocupacao {string}")
	public void clico_no_campo_Occupation_seleciono_a_minha_ocupacao(String string) {
	    Configuracao.seletorQueryCss("#occupation").sendKeys(string);
	}

	@Dado("clico em selecionar a opcao de hobbies")
	public void clico_em_selecionar_a_opcao_de_hobbies() {
	    Configuracao.seletorQueryCss("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5) > span").click();
	}

	@Dado("clico em website digito o minha pagina na internet {string}")
	public void clico_em_website_digito_o_minha_pagina_na_internet(String string) {
	    Configuracao.seletorQueryCss("#website").sendKeys(string);
	}

	@Dado("clico no botao next que encaminha para aba enter product Data")
	public void clico_no_botao_next_que_encaminha_para_aba_enter_product_Data() {
	    Configuracao.seletorQueryCss("#nextenterproductdata").click();
	}

	@Dado("clico no campo Start e Date digito a data de inicio {string}")
	public void clico_no_campo_Start_e_Date_digito_a_data_de_inicio(String string) {
		Configuracao.seletorQueryCss("#startdate").sendKeys(string);
	}

	@Dado("clico no campo Insurance Sum digito o valor assegurado {string}")
	public void clico_no_campo_Insurance_Sum_digito_o_valor_assegurado(String string) {
	    Configuracao.seletorQueryCss("#insurancesum").sendKeys(string);
	}
	
		@Dado("clico no campo Merit Rating escolho a classificacao {string}")
	public void clico_no_campo_Merit_Rating_escolho_a_classificacao(String string) {
	   Configuracao.seletorQueryCss("#meritrating").sendKeys(string);
	}

	@Dado("clico no campo Demage Insurance escolho a opcao de cobertura do seguro {string}")
	public void clico_no_campo_Demage_Insurance_escolho_a_opcao_de_cobertura_do_seguro(String string) {
		Configuracao.seletorQueryCss("#damageinsurance").sendKeys(string);
	}

	@Dado("clico no campo Optional Products para escolher os produtos opcionais")
	public void clico_no_campo_Optional_Products_para_escolher_os_produtos_opcionais() {
	    Configuracao.seletorQueryCss("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span").click();
	}

	@Dado("clico no campo Courtesy Car escolho se quero o carro de cortesia {string}")
	public void clico_no_campo_Courtesy_Car_escolho_se_quero_o_carro_de_cortesia(String string) {
	    Configuracao.seletorQueryCss("#courtesycar").sendKeys(string);
	}

	@Dado("clico no campo next que vai redirecionar para aba Select Price Option")
	public void clico_no_campo_next_que_vai_redirecionar_para_aba_Select_Price_Option() {
	    Configuracao.seletorQueryCss("#nextselectpriceoption").click();
	}

	@Dado("clico no opcao de seguro escolhida")
	public void clico_no_opcao_de_seguro_escolhida() throws InterruptedException {
	    Configuracao.seletorQueryCss("#priceTable > tfoot > tr > th.group > label:nth-child(1)").click();
	    Thread.sleep(3000);
	}

	@Dado("clico no botao next que vai redirecionar para aba Send Quote")
	public void clico_no_botao_next_que_vai_redirecionar_para_aba_Send_Quote() {
	    Configuracao.seletorQueryCss("#nextsendquote").click();
	}

	@Dado("clico no campo e-mail digito meu email {string}")
	public void clico_no_campo_e_mail_digito_meu_email(String string) {
	    Configuracao.seletorQueryCss("#email").sendKeys(string);
	}

	@Dado("clico no campo Phone digito o telefone para contato {string}")
	public void clico_no_campo_Phone_digito_o_telefone_para_contato(String string) {
	    Configuracao.seletorQueryCss("#phone").sendKeys(string);
	}

	@Dado("clico no campo Username crio um nome de usuario {string}")
	public void clico_no_campo_Username_crio_um_nome_de_usuario(String string) {
	    Configuracao.seletorQueryCss("#username").sendKeys(string);
	}

	@Dado("clico no campo password crio uma senha {string}")
	public void clico_no_campo_password_crio_uma_senha(String string) {
	    Configuracao.seletorQueryCss("#password").sendKeys(string);
	}

	@Dado("clico no campo confirm password digito a mesma senha criada anteriormente {string}")
	public void clico_no_campo_confirm_password_digito_a_mesma_senha_criada_anteriormente(String string) {
	    Configuracao.seletorQueryCss("#confirmpassword").sendKeys(string);
	}

	@Dado("clico no campo comments insero um comentario {string}")
	public void clico_no_campo_comments_insero_um_comentario(String string) {
	   Configuracao.seletorQueryCss("#Comments").sendKeys(string);
	}

	@Dado("clico no botao send")
	public void clico_no_botao_send() throws InterruptedException {
	    Configuracao.seletorQueryCss("#sendemail").click();
	    Thread.sleep(15000);
	}
	
	@Entao("devo visualizar a mensagem {string}")
	public void devo_visualizar_a_mensagem(String string) {
		  WebElement input = Configuracao.seletorQueryCss("body > div.sweet-alert.showSweetAlert.visible > h2");
		    assertEquals(string,input.getText());
		    input.click();
	}
	
	@Entao("clicar no botao OK")
	public void clicar_no_botao_OK() {
	    Configuracao.seletorQueryCss("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button").click();
	    Configuracao.fechar();
	}
	
}
