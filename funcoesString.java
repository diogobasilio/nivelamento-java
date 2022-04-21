public class Main {
	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG       ";
		
		String s01 = original.toLowerCase(); // Vai deixar tudo minúsculo
		String s02 = original.toUpperCase(); // Vai deixar tudo maiúsculo 
		String s03 = original.trim(); // Vai apagar os espaços em branco
		String s04 = original.substring(2); // Vai criar uma nova String a partir do index informado
		String s05 = original.substring(2, 9); // Vai criar uma nova String entre esses intervalos de index
		String s06 = original.replace('a', 'x'); // Vai percorrer a String e trocar o 'a' pelo 'x'
		String s07 = original.replace("abc", "xy"); // Vai percorrer a String e trocar o substring informado
		int i = original.indexOf("bc"); // Vai encontrar a posição do substring index
		int j = original.lastIndexOf("bc"); //Vai informar a última ocorrência de acordo com index
				
		
		System.out.println("Original: - " + original + " -");
		System.out.println("toLowerCase: - " + s01 + " -");
		System.out.println("toUpperCase: - " + s02 + " -");
		System.out.println("trim: - " + s03 + " -");
		System.out.println("substring 01: - " + s04 + " -");
		System.out.println("substring 02: - " + s05 + " -");
		System.out.println("replace 01: - " + s06 + " -");
		System.out.println("replace 02: - " + s07 + " -");
		System.out.println("replace 02: - " + s07 + " -");
		System.out.println("indexOf 'bc': - " + i + " -");
		System.out.println("lastIndexOf 'bc': - " + j + " -");
	}
}
