Esta clase MyLamda se ha centrado en implementar los objetivos demandados, por eso en la clase main tan solo se
pasan los parametros solicitados en el enunciado, es decir, el array [4, 5, 898, 34] y posteriormente el 0, 
aunque este no tenía muy claro si era necesario. Se ha seguido el enunciado al pie de la letra, aunque esto
haya hecho por ejemplo que la funcion isOdd ("es Impar") nos devuelva verdadero cuando el número es par.

Para realizar pruebas de funcionamiento he creado un array que se encuentra comentado en la entrega y es el siguiente.

		/* Lista creada para hacer pruebas
		 *
		 List <Integer> numList=new ArrayList<Integer>();
		 
		 for (int i=-20; i<700;i++) {
			
		 	numList.add(i);
		 }
		*/
Así he podido verificar el correcto funcionamiento para los números negativos y un amplio abanico de números primos.

Para la resolución he optado por implementar una funtional interface, ya que las 3 funciones tienen como parametro de entra
un número y como salida un boleano.

Para verificar si era par tan solo he creado una condición para determinar si el resto de dividir el número entre 2 era 0.

Para verificar si es primo he creado un método isPrime, donde asigno a una variable booleana la condición es mayor que 1 y
la condición negada de si es par y diferente de 2. Así asigno el valor false si es más pequeño o igual a 1 o si es par diferente de 2.
Si es falso ya no entra en el bucle while. En el bucle recorremos todos los números impares a partir de 3 hasta que x%i sea igual a 0 
(dando como resultado falso ya que negamos la condición, por lo tanto no volverá a entrar al bucle y nos dará como resultado false) o
hasta que i*i sea mayor a x (al poner como condición i*i lo hacemos más eficiente, ahorrando ciclos innecesarios ya que o será 
divisible por un número más pequeño o será un número primo).
Los números 2, 3, 5 y 7 ni tan solo entran en el bucle pero dan un resultado final de true. Cualquier número que no sea divisible por un 
número primo (es decir el 2 y una larga lista de números impares) será también primitivo y devolverá true.

Para verificar si es palindromo utilizo la función reverse() que invierte los caracteres de un String. Como el tipo a tratar es un Integer
lo primero que tengo que hacer es convertirlo a String con un String.valueOf(x). Comparo las 2 cadenas con la función equals y se si es un
 palindromo.

Para finalizar imprimo el resultado de estas funciones intentando hacerlo lo más parecido a lo que se pide (o según lo entiendo yo).