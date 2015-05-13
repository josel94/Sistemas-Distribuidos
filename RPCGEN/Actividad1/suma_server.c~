
#include "suma.h"

// Procedimiento donde se realizará la suma

int *
suma_1_svc(intpair *argp, struct svc_req *rqstp)
{
	static int  result;

	printf("Server response to client...\n"); // Se corrobora que exista conexión entre el cliente y el servidor
	printf("parameters: %d, %d\n", argp->a, argp->b); //Se obtienen los valores de los sumando y se imprimen cuales son.
	result = argp->a + argp->b; // Se hace la suma de los 2 valore
	printf("returning: %d\n", result); // Se imprime el resultado
	return &result; // Se regresa el resultado
}
