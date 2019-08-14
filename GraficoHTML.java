package GoogleCharts;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GraficoHTML {

	public static void geraHtml(int[] vetor) throws IOException {
		
		String html = "<html>\r\n" + 
				"<head>\r\n" + 
				"  <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n" + 
				"    <script type=\"text/javascript\">\r\n" + 
				"      google.charts.load('current', {'packages':['line']});\r\n" + 
				"      google.charts.setOnLoadCallback(drawChart);\r\n" + 
				"\r\n" + 
				"    function drawChart() {\r\n" + 
				"\r\n" + 
				"      var data = new google.visualization.DataTable();\r\n" + 
				"      data.addColumn('number', 'Dia');\r\n" + 
				"      data.addColumn('number', 'Dist�ncia percorrida');\r\n" + 

				"\r\n" + 
				"      data.addRows([\r\n" + 	retornaDados(vetor) +		"      ]);\r\n" + 
				"\r\n" + 
				"      var options = {\r\n" + 
				"        chart: {\r\n" + 
				"          title: 'Acompanhamento de Treino de Corrida',\r\n" + 
				"          subtitle: 'Dist�ncia percorrida di�ria'\r\n" + 
				"        },\r\n" + 
				"        width: 900,\r\n" + 
				"        height: 500,\r\n" + 
				"        axes: {\r\n" + 
				"          x: {\r\n" + 
				"            0: {side: 'top'}\r\n" + 
				"          }\r\n" + 
				"        }\r\n" + 
				"      };\r\n" + 
				"\r\n" + 
				"      var chart = new google.charts.Line(document.getElementById('line_top_x'));\r\n" + 
				"\r\n" + 
				"      chart.draw(data, google.charts.Line.convertOptions(options));\r\n" + 
				"    }\r\n" + 
				"  </script>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"  <div id=\"line_top_x\"></div>\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"\r\n" + 
				"";
		
		
		FileWriter arquivo = new FileWriter("C:\\Program Files (x86)\\Google Charts");
	    PrintWriter gravarArquivo = new PrintWriter(arquivo);
	 
	    gravarArquivo.printf(html);
	    arquivo.close();
	}
	
	
	private static String retornaDados(int[] vetor) {
		String dados = "";
		for (int i = 0; i<vetor.length; i++) {
			dados += "[" + String.valueOf(i+1) + ", " + String.valueOf(vetor[i]) +"],\r\n";
		}
		return dados;
	}
	
}





