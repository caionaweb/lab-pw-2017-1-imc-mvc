package mvc;

public class Model {

	private float imc;
	private String sexo;

	public Model(float imc, String sex) {
		this.imc = imc;
		this.sexo = sexo;
	}

	public String resultado() {
		String imcF = String.format("%.2f", imc);

		if (Float.isNaN(imc)) {
			return "";
		}

		if (sexo == "f") {
			if (imc < 20.7) {
				return "<div class='card-panel red white-text'>IMC: " + imcF
						+ " <br><b>Cuidado!</b> Voc� est� abaixo do peso.</div>";
			} else if (imc < 26.4) {
				return "<div class='card-panel green white-text'>IMC: " + imcF
						+ " <br><b>Otimo!</b> Voc� est� no peso normal.</div>";
			} else if (imc < 27.8) {
				return "<div class='card-panel yellow darken-2 white-text'>IMC: " + imcF
						+ " <br><b>Aten��o!</b> Voc� marginalmente acima do peso.</div>";
			} else if (imc < 31.1) {
				return "<div class='card-panel orange white-text'>IMC: " + imcF
						+ " <br><b>Cuidado!</b> Voc� acima do peso ideal.</div>";
			} else {
				return "<div class='card-panel red white-text'>IMC: " + imcF
						+ " <br><b>Cuidado!</b> Voc� na faixa de obesidade.</div>";
			}
		} else {
			if (imc < 19.1) {
				return "<div class='card-panel red white-text'>IMC: " + imcF
						+ " <br><b>Cuidado!</b> Voc� est� abaixo do peso.</div>";
			} else if (imc < 25.8) {
				return "<div class='card-panel green white-text'>IMC: " + imcF
						+ " <br><b>Otimo!</b> Voc� est� no peso normal.</div>";
			} else if (imc < 27.3) {
				return "<div class='card-panel yellow darken-2 white-text'>IMC: " + imcF
						+ " <br><b>Aten��o!</b> Voc� marginalmente acima do peso.</div>";
			} else if (imc < 32.3) {
				return "<div class='card-panel orange white-text'>IMC: " + imcF
						+ " <br><b>Cuidado!</b> Voc� acima do peso ideal.</div>";
			} else {
				return "<div class='card-panel red white-text'>IMC: " + imcF
						+ " <br><b>Cuidado!</b> Voc� na faixa de obesidade.</div>";
			}
		}

	}
}
