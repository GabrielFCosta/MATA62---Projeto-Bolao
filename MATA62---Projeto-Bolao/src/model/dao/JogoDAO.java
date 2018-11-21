
package model.dao;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import model.vo.Aposta;
import model.vo.Jogo;
import static bolao.Executavel.lRegistros;




public class JogoDAO {
  
    public void gerarRelatorio(Jogo relat) throws FileNotFoundException, DocumentException, IOException{
    Document document = new Document(PageSize.A4, 72,72,72,72);
       PdfWriter.getInstance(document, new FileOutputStream("relatorio_"+relat.getMes()+"_"+relat.getNome()+".pdf"));
       document.open();
       document.add(new Paragraph("----------SISTEMA INTEGRADO DE RECURSOS HUMANOS-----------"));
       document.add(new Paragraph("\n"));
       document.add(new Paragraph("\n"));
       document.add(new Paragraph("----------RELATÓRIO MENSAL DE CONTROLE DE PONTO-----------"));
       document.add(new Paragraph("\n"));
       document.add(new Paragraph(relat.toString()));
       document.add(new Paragraph("\n"));
       document.add(new Paragraph("Dia "+"     "+"ENTRADA"+"    SAÍDA INTER"+"    ENTRADA INTER"+"      SAÍDA"));
   for(Aposta r : lRegistros){
   if(relat.getMatricula()==r.getMatricula() && relat.getMes().equals(r.getMes()) && relat.getAno()==r.getAno()){
        document.add(new Paragraph(r.getDia()+"------"+r.getEnt()+"------------"+r.getSaida_intervalo()+"-----------"+ r.getEnt_intervalo()+"-----------"+r.getSaida()));
     }     
     }     
            
            
        document.close();
        Desktop.getDesktop().open(new File("relatorio_"+relat.getMes()+"_"+relat.getNome()+".pdf"));
    }
    }