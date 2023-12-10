monto(100.00, 0.00, 50.00,1).
monto(150.00, 5.00, 0.00,2).
monto(200.00, 95.00, 0.00,3).
monto(220.00, 0.00, 150.00,4).

% Hechos para representar departamentos
depto(1,'1A', 'Juan',1).
depto(1,'1B', 'Moro',2).
depto(1,'2A', 'Adrian', 3).
depto(1,'2B', 'Jose',4).

consorcio('Consorcio1', 'Direccion1',1).

busca(NUMDT,NOMCON,NOMDUE,MONT,FAVOR,CONTRA,DIREC) :- consorcio(NOMCON,DIREC,Q), depto(Q,NUMDT,NOMDUE,A), monto(MONT,FAVOR,CONTRA,A).