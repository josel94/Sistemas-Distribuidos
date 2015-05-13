// Se crea el cliente, donde habra 2 funciones que éste podra ejecutar. El add y search


#include "add.h"

void
add_prog_1(char *host,char *opcion, char *nombre)
{
	CLIENT *clnt; 
	char * *result_1;	// Guardará el resultado del metodo ADD
	char * add_1_arg; // Se guarda el parametro para el metodo ADD
	char * *result_2; // Guardará el resultado para el metodo SEARCH
	char * search_1_arg; // Se guarda el parametro para el metodo SEARCH


	clnt = clnt_create (host, ADD_PROG, ADD_VERS, "udp");
	if (clnt == NULL) {
		clnt_pcreateerror (host);
		exit (1);
	}

	if(strcmp(opcion,"1")==0){  // Si se elige la opcion 1 se hace el ADD
	add_1_arg = nombre;
	result_1 = add_1(&add_1_arg, clnt); // Se ejecuta el metodo ADD

	if (result_1 == (char **) NULL) { // Si el resultado es distinto que Char lleva a un error
		clnt_perror (clnt, "call failed");
		}
	else{
		printf("%s\n", *result_1);	// Se imprime el resultado del metodo ADD
		}
	}

	if(strcmp(opcion,"2")==0){ // Si se elije la opcion 2 se hace el SEARCH
		search_1_arg = nombre;
		result_2 = search_1(&search_1_arg, clnt); // Se ejecuta el metodo SEARCH

		if (result_2 == (char **) NULL) { // Se verifica el resultado optenido
			clnt_perror (clnt, "call failed");
		} else{
			printf("%s\n", *result_2);	// Se imprime el resultado del metodo SEARCH
		}
	}


	clnt_destroy (clnt);

}


int
main (int argc, char *argv[])
{
	char *host;
	char *nombre;
	char *opcion;
	if (argc < 2) {
		printf ("usage: %s server_host\n", argv[0]);
		exit (1);
	}
	host = argv[1];
	opcion = argv[2];
	nombre = argv[3];
	add_prog_1 (host,opcion,nombre);
exit (0);
}
