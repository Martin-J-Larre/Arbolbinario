package arbolbinario;


//Definición de la clase Arbol
class Arbol{
NodoBinario Padre;
public NodoBinario Raiz;
//Constructor
public Arbol(){
Raiz = null;
}

// Se codificaron 2 métodos y en caso de que el nodo padre de
// referencia sea nulo se asume que es la raíz

//Inserción de un hijo izquierdo
public NodoBinario InsertaNodoHIzq(NodoBinario Nodo, int Elem){
NodoBinario result=null;
Integer Elemento = new Integer(Elem);
if (Nodo==null) {
NodoBinario NodoAux = new NodoBinario (Elem);
result=NodoAux;
Raiz=NodoAux;
} else {
if(Nodo.Hizq == null) {
NodoBinario NodoAux = new NodoBinario (Elem);
Nodo.Hizq=NodoAux;
result=NodoAux;
}
else
System.out.print ("ERR- Hijo izquierdo de "+
Elemento.toString() +" no es nulo");
}
return result;
}
//Inserción de un hijo derecho
public NodoBinario InsertaNodoHDer(NodoBinario Nodo, int Elem){
NodoBinario result=null;
Integer Elemento = new Integer(Elem);
if (Nodo==null) {
NodoBinario NodoAux = new NodoBinario (Elem);
result=NodoAux;
Raiz=NodoAux;
} else {
if(Nodo.Hder == null) {
NodoBinario NodoAux = new NodoBinario (Elem);
Nodo.Hder=NodoAux;
result=NodoAux;
}
else
System.out.print ("ERR- Hijo Derecho de "+
Elemento.toString() +" no es nulo");
}
return result;
}


// Todo 1 ==>
//Inorden Recursivo del arbol
//public void Inorden (NodoBinario Nodo){
//…
//}

// Todo 2 ==>
//Altura del arbol
//public int Altura (NodoBinario Nodo){
//…
//}
}