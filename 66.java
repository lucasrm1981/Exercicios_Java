/* 66)Trabalhar com Strings multilinhas usando Text Blocks
 *
 * Defina uma String que contenha a estrutura básica de um documento HTML.
 * O título da página deve ser "Seu Titulo", e seu corpo deve conter um h1 com Titulo Qualquer e
 * com o texto H2 "Linguagem de Programacao".
 */
 
 class HtmlGenerator {
   
   public static void main(String[] args) {
    String instituicao = "SENAC";
    String curso = "Técnico em Informática";
    String uc = "Linguagem de Programação";
    
    String html = """
      <html>
       <head>
        <title>%s</title>
       </head>
       <body>
        <h1>%s</h1>
        <h2>%s</h2>
      </body>
     </html>
     """.formatted(instituicao, curso, uc);

    System.out.println(html);
   }
 }