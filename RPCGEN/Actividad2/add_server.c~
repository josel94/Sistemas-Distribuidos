// Se declaran lo metodos que se van a realizar en el server

#include "add.h"
#include <time.h>
#include <stdlib.h>
#include <string.h>

char **
add_1_svc(char **argp, struct svc_req *rqstp) {
	static char * result;

	FILE *file= fopen("file.txt","a+"); // Se lee el archivo 
	if(file == NULL) { // Se verifica si hay informacion
		printf("No hay datos en el archivo\n");
		exit(1);
	}

	printf("Hay respuesta del Servidor\n"); // Se comprueba que exita la conexion

	time_t t = time(NULL);
	char * time = asctime(localtime(&t));  // Se obtiene la fecha del sistema
	fprintf(file,"%s %s",*argp,time); // Se escribe la informacion en el txt
	asprintf(&result,"the server added: %s %s\n",*argp,time); // Se imprime lo que sucede en el servidor para el cliente
	printf("the server added: %s %s\n",*argp,time); // Se imprime en el servidor
	fclose(file);// Se cierra el archivo
	return &result; // Se manda el resultado
}

char **
search_1_svc(char **argp, struct svc_req *rqstp) {
	static char * result;
	char *archivo;
	int contador = 0; // Un contador para saber cuantos se han guardado en el archivo con el nombre que se busca

printf("Server is searching for: %s\n",*argp); // Se imprime el nombre de quien se busca

FILE *file= fopen("file.txt","r"); // Se abre el archivo
	if(file == NULL) {
	printf("No hay datos en el archivo\n"); // Se verifica que no se encuentre vacio
	exit(1);
}
	char *s;
		
	const size_t line_size = 300;
	char* line = malloc(line_size);
	while (fgets(line, line_size, file) != NULL) // Se lee renglon a reglon hasta que se no haya más
	{
		s = strstr(line,*argp);
		if(s!=NULL){ // Si se encuentra una semejanza se le suma 1 al contador
			contador++;
		}
	}
asprintf(&result,"Server found in txt file %s %i times", *argp, contador); // Se guarda la informacion en la variable result

printf("Server found in txt file %s %i times", *argp, contador); // se dice el resultado encontrado en el server
	return &result; // Se manda el resultado
}
