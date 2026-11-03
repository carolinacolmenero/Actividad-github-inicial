# Actividad-github-inicial
Desarrollo de una calculadora que realice las operaciones de sumar, restar, multiplicar y dividir.


## Cómo funciona

1. El programa pide dos números.
2. Muestra un menú con las operaciones disponibles.
3. El usuario escribe la operación que quiere hacer.
4. El programa muestra el resultado por consola.

Si se intenta dividir entre 0, el programa avisa de que no se puede hacer.


## Resolución de Conflictos

Durante el proyecto tuvimos un conflicto en Git. Irene hizo primero un commit con su parte del código y lo subió al repositorio. Después, Lucas subió su parte, pero como los dos habían modificado el mismo archivo, `App.java`, Git no pudo unir los cambios automáticamente y apareció el conflicto.

Para resolverlo, hicimos un `git pull` para descargar los cambios de Irene. Después, en el IDE, vimos las dos versiones del código marcadas con `<<<<<<<`, `=======` y `>>>>>>>`. Revisamos qué había aportado cada uno, mantuvimos las partes necesarias y borramos las marcas de conflicto.

Una vez comprobado que el programa funcionaba bien, hicimos un nuevo commit y subimos los cambios con `git push`.