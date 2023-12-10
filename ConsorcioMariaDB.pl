use_module(library(odbc)).

abrir_conexion :-
    odbc_connect('consorcio', _, [
        user('root'), 
        password('191101'), 
        alias('consorcio'), 
        open(once),
        port(3307)
    ]).

cerrar_conexion :- odbc_disconnect('consorcio').

% depto(Id, Depto) :- odbc_query('consorcio', 'SELECT (id), (depto) FROM depto Order By depto', row(Id, Depto)).

depto(Id, Depto) :-
    abrir_conexion,
    writeln('Conexión abierta correctamente.'),
    (
        odbc_query('consorcio', 'SELECT id, depto FROM depto ORDER BY depto', row(Id, Depto))
        -> writeln('Consulta ejecutada correctamente.')
        ;  writeln('Error al ejecutar la consulta.')
    ),
    cerrar_conexion.