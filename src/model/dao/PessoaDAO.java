/**
 * 
 */
package model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

import model.bo.PessoaBO;

/**
 * @author Gabriel
 *
 */
public class PessoaDAO {

	//variáveis para carregamento dos arquivos.
    private ObjectInputStream objIN;
    private FileInputStream fileIN;
    /**
     * Construtor da classe.
     * define objIN e fileIN como null.
     */
    public PessoaDAO(){
        objIN = null;
        fileIN = null;
    }
    /**
     * Carrega base de dados de pessoas, pesssoas.bin, no HashSet de Pessoas.
     * Utiliza métodos getFile(String filename) e getObject(FileInputStream file, String n)
     * internamente.
     * @return pessoas carregado ou vazio.
     */
    public PessoaBO loadPessoas(){
        PessoaBO pessoas = new PessoaBO();
        fileIN = getFile("pessoas.bin");
        if(fileIN != null){
            objIN = getObject(fileIN,"pessoas");
            if(objIN != null){
                try{
                    pessoas = (PessoaBO) objIN.readObject();
                    fileIN.close();
                    objIN.close();
                    return pessoas;
                }
                catch(IOException e){
                    return pessoas;
                }
                catch(ClassNotFoundException e){
                    try{
                        fileIN.close();
                        objIN.close();
                    }catch(IOException f){}
                    return pessoas;
                }
                catch(ClassCastException e){
                    try{
                        fileIN.close();
                        objIN.close();
                    }catch(IOException f){}
                    return pessoas;
                }

            }
        }
        return pessoas;
    }
    /**
     * Retorna objeto do tipo FileInputStream utilizado no carregamento de arquivos
     * @param filename String do nome do arquivo a ser carregado.
     * @return file ou null.
     */
    public FileInputStream getFile(String filename){
        try{
            FileInputStream file = new FileInputStream(filename);
            return file;
        }
        catch(FileNotFoundException e){
            return null;
        }
        catch(SecurityException e){
            return null;
        }
    }
    /**
     * Retorna objeto do tipo ObjectInputStream utilizado no carregamento de arquivos
     * @param file objeto do tipo FileInputStream.
     * @param n String do nome do set a ser carregado.
     * @return objeto ou null.
     */
    public ObjectInputStream getObject(FileInputStream file, String n){
        try{
            ObjectInputStream objeto = new ObjectInputStream(file);
            return objeto;
        }
        catch(StreamCorruptedException e){
            return null;
        }
        catch(IOException e){
            return null;
        }
        catch(SecurityException e){
            return null;
        }
    }
    /**
     * Retorna objeto do tipo FileOutputStream utilizado na gravação de arquivos
     * @param filename String do nome do arquivo a ser gravado.
     * @return file ou null.
     */
    public FileOutputStream getFileOut(String filename){
        try{
            FileOutputStream file = new FileOutputStream(filename);
            return file;
        }
        catch(FileNotFoundException e){
                return null;
        }
        catch(SecurityException e){
                return null;
        }
    }
    /**
     * Retorna objeto do tipo ObjectOutputStream utilizado na gravação de arquivos
     * @param file objeto do tipo FileOutputStream.
     * @return objeto ou null.
     */
    public ObjectOutputStream getObjectOut(FileOutputStream file){
        try{
            ObjectOutputStream objeto = new ObjectOutputStream(file);
            return objeto;
        }
        catch(IOException e){
            return null;
        }
        catch(SecurityException e){
            return null;
        }
    }
    /**
     * Retorna true se arquivo gravado ou false se ocorreu alguma exceção.
     * @param obj objeto do tipo ObjectOutputStream.
     * @param pessoas Set de pessoas a ser gravado ou nulo.
     * @return true arquivo gravado, false se ocorreu alguma exceção.
     */
    public boolean escritaArquivo(ObjectOutputStream obj,PessoaBO pessoas){
        try{
            obj.writeObject(pessoas);
            obj.close();
            return true;
        }
        catch(InvalidClassException e){
            return false;
        }
        catch(NotSerializableException e){
            return false;
        }
        catch(IOException e){
            return false;
        }
    }
    /**
     * Tenta gravar set em arquivo binario de acordo com parâmetros.
     * Utiliza internamente os métodos getFileOut(String filename), getObjectOut(FileOutputStream file)
     * e escritaArquivo(ObjectOutputStream obj,boolean param).
     * @param filename String do nome do arquivo a ser salvo.
     * @param pessoas Set de pessoas a ser gravado ou nulo.
     */
    public void salvaArquivo(String filename, PessoaBO pessoas){

        //variáveis para gravação dos arquivos.
        ObjectOutputStream objOUT = null;
        FileOutputStream fileOUT = null;
        fileOUT = getFileOut(filename);
        if(fileOUT != null){
            objOUT = getObjectOut(fileOUT);
            if(objOUT != null){
                    if(!(escritaArquivo(objOUT, pessoas))){
                        System.out.printf("Erro ao gravar arquivo\n");
                    }
                    else System.out.printf("Arquivo gravado\n");
            }
            else System.out.printf("Erro: Objeto nulo.\n");
        }
        else System.out.printf("Erro: Arquivo nulo.\n");
    }
}
