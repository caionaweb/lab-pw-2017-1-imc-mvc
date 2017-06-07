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
			if (imc < 19.1) {
				return "<div class='card-panel red white-text'>IMC: " + imcF
						+ " <br><b>Cuidado!</b> Você está abaixo do peso.</div>";
			} else if (imc > 25.8) {
				return "<div class='card-panel green white-text'>IMC: " + imcF
						+ " <br><b>Otimo!</b> Você está no peso normal.</div>";
			} else {
				return "<div class='card-panel yellow darken-2 white-text'>IMC: " + imcF
						+ " <br><b>Atenção!</b> Você está marginalmente acima do peso.</div>";
			}
		} else {
			if (imc < 20.7) {
				return "<div class='card-panel red white-text'>IMC: " + imcF
						+ " <br><b>Cuidado!</b> Você está abaixo do peso.</div>";
			} else if (imc > 26.4) {
				return "<div class='card-panel green white-text'>IMC: " + imcF
						+ " <br><b>Otimo!</b> Você está no peso normal.</div>";
			} else {
				return "<div class='card-panel yellow darken-2 white-text'>IMC: " + imcF
						+ " <br><b>Atenção!</b> Você está marginalmente acima do peso.</div>";
			}
		}

	}
}
