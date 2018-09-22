#include "ahorcado.h"
#include <iostream>
#include <string>
#include <cstdlib>
#include <vector>
#include <time.h>
using namespace std;

ahorcado::ahorcado()
{
    //ctor
}

string palabra_original;
string palabra_mostrar;
int vidas;


void ahorcado::mein(){

    inicializar();
    mostrar();
    while(vidas>0 && palabra_mostrar!=palabra_original){
        char x;
        cin>>x;
        system("cls");
        ingresar(x);
        mostrar();
    }//fin while

   //INICIA IF 1, LÍNEA 26
    if(vidas>0){
        cout << "Ganaste"<<endl;
    }else{
        cout << "Perdiste, la palabra era: "<<palabra_original<<endl;
    }
    // TERMINA IF 1,LÍNEA 32


}




void ahorcado::mostrar(){

    cout << endl<<endl;
    cout << "Vidas: "<<vidas<<endl;
    cout << palabra_mostrar<<endl;
}




void ahorcado::ingresar(char x){
    bool perdividas=true;

    for(int i=0; i<palabra_original.length(); i++){
        if(x==palabra_original[i]){
            perdividas=false;
            palabra_mostrar[i]=x;
        }
    }

    if(perdividas) vidas--;
}



void ahorcado::inicializar(){
        vidas = 6;
        palabra_original=obtener_palabra_aleatoria();

    /*inicia for*/
        for(int i=0; i<palabra_original.length() ; i++){
        if(palabra_original[i]>='A' && palabra_original[i]<='Z'){
            palabra_original[i]+=32;
        }
    }

    //inicia segundo for
    for (int j=0; j<palabra_original.length() ; j++){
        if(palabra_original[j]>='a' && palabra_original[j]<='z'){
            palabra_mostrar+='*';
        }else{
            palabra_mostrar+=palabra_original[j];
        }
    }
}



string ahorcado::obtener_palabra_aleatoria(){
  int dato;

    vector<string>palabras;
    palabras.push_back("juego");
    palabras.push_back("ahorcado");
    palabras.push_back("programa");
    palabras.push_back("teclas");
    palabras.push_back("pantalla");

    srand(time(NULL));
    dato = 0 + rand()%(5);

    return palabras[dato];
}
