//Nombre: 
//Legajo: INFXXXXX
//DNI: XXXXXXXX
package arbolbinario;


public class ArbolBinario {
public static void main(String[] ar) {
Arbol A = new Arbol();
System.out.print("\n Agregando la raiz 30 \n");
NodoBinario
NodoAux=null,NodoAux2=null,NodoAux3=null,NodoAux4=null;
NodoAux2=A.InsertaNodoHIzq(NodoAux, 30);
NodoAux=NodoAux2;
NodoAux2=A.InsertaNodoHIzq(NodoAux, 25);
NodoAux3=A.InsertaNodoHDer(NodoAux, 45);
NodoAux=NodoAux2;
NodoAux2=A.InsertaNodoHIzq(NodoAux, 20);
NodoAux4=A.InsertaNodoHDer(NodoAux, 27);
System.out.print("\n El árbol binario en In orden es: \n");
A.Inorden (A.Raiz);
Integer Altura = new Integer(A.Altura (A.Raiz));
System.out.print("\n La altura del árbol es: "+
Altura.toString() +"\n");
}
    
}




//GitHub https://github.com/Martin-J-Larre/Arbolbinario