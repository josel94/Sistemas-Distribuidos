
#include "suma.h"
#include <stdio.h>

//Suma de 2 números enteros


void
suma_prog_1(char *host, int a, int b)
{
	CLIENT *clnt;
	int  *result_1; //Variable que recibe el resultado del Servidor
	intpair  suma_1_arg; //Aquí se guarda los parametros que se mandan


	clnt = clnt_create (host, SUMA_PROG, SUMA_VERS, "udp");
	if (clnt == NULL) { // se verifica que se cree el cliente
		clnt_pcreateerror (host);
		exit (1);
	}

	suma_1_arg.a = a; // Se guarda la variable a (primer sumando)
   	suma_1_arg.b = b; // Se guarda la variable b (Segundo sumando)
	result_1 = suma_1(&suma_1_arg, clnt); //Despues de la ejecución se recibe el resultado
	if (result_1 == (int *) NULL) { // en caso de que lo que se regrese no sea un entero significa que existe un error
    		clnt_perror (clnt, "call failed");
	} else {
    		printf("result = %d\n", *result_1); //Se imprime el resultada para el cliente
}

	clnt_destroy (clnt);
}


int
main (int argc, char *argv[])
{
	char *host; // Nombre del servidor
        int a, b; // los sumandos
        if (argc != 4) {
            printf ("usage: %s server_host num1 num2\n", argv[0]);
            exit(1);
        }
        host = argv[1]; // se recibe el nombre del servidor por parte del cliente

			// Se verifica que los valores que se recibieron son enteros
        if ((a = atoi(argv[2])) == 0 && *argv[2] != '0') {
            fprintf(stderr, "invalid value: %s\n", argv[2]);
            exit(1);
        }
        if ((b = atoi(argv[3])) == 0 && *argv[3] != '0') {
            fprintf(stderr, "invalid value: %s\n", argv[3]);
            exit(1);
        }
        suma_prog_1(host, a, b); // Se ejecuta el proceso que se declaro antes

}
