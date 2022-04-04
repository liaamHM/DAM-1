use Bar;

-- Creamos las tablas de Facturacion y de Ventas
create table Facturacion(
	ID int identity (1,1) NOT NULL,
	Dates Date NOT NULL,
	Import decimal(29,2) DEFAULT 0
)

create table Ventas(
	ID int identity(1,1) NOT NULL,
	Dates Date NOT NULL,
	ArticleID INT FOREIGN KEY REFERENCES Articulo(Id),
	Sells INT DEFAULT 0
)

ALTER TABLE Linea
ADD Dates Date


CREATE TRIGGER tgrFacturacion
	ON Linea
	AFTER insert
AS BEGIN
	DECLARE @Import decimal(29, 2)
	DECLARE @Dates date
	DECLARE @Exist int

	set @Dates = getDate()
	select @exist = count(*) from Facturacion where Dates = @Dates
	select @Import = sum(TotalLinea) from Linea Where Dates = @Dates

	if(@exist = 0) BEGIN
		INSERT INTO Facturacion(Dates, Import)
		VALUES (@Dates, @Import)
	END
	IF(@exist = 1) BEGIN
		UPDATE Facturacion SET Import = @Import WHERE Dates = @Dates
	END
END
GO

CREATE TRIGGER tgrVentas
	ON Linea
	AFTER insert
AS BEGIN
	DECLARE @Dates date
	DECLARE @Sells int
	DECLARE @Exist int
	DECLARE @ArticleID int

	SET @Dates = getDate()

	SELECT TOP 1 @ArticleID = ArticleId FROM Inserted ORDER BY Id Desc
	SELECT @Sells = Stoks from Linea where ArticleId = @ArticleID AND Dates = @Dates

	SELECT @Exist = count(*) FROM Ventas  WHERE Dates = @Dates AND ArticleID = @ArticleID

	if(@Exist = 0) BEGIN
		INSERT INTO Sells (Dates, ArticleID, Sells)
		VALUES (@Dates, @ArticleID, @Sells)
	END
	if(@Exist = 1) BEGIN
		UPDATE Ventas
		SET Ventas = @Sells WHERE Dates = @dates AND ArticleID = @ArticleID
	END
END
GO

CREATE TRIGGER tgrDatosArticulo
	ON Linea
	AFTER insert
AS BEGIN
	
	DECLARE @Sells INT
	DECLARE @ArticleID INT

	DECLARE @Dates Date
	SET Dates = getDate()

	SELECT @ArticleID = ArticleID, @Sells = Stoks from inserted

	UPDATE Articulo
	SET Ventas = Sells + @Sells WHERE Id = @ArticleID


	DECLARE @precio DECIMAL(29, 2)
	DECLARE @nombreProducto nvarchar(50)
	DECLARE @TipoIvaID int
	DECLARE @LineaID int

	SELECT @precio = PrecioFinal, @nombreProducto = Nombre, @TipoIvaID = TipoIvaId 
	from Articulo where ID = @ArticuloID

	SELECT top 1 @LineaID = ID from Linea ORDER BY ID desc

	UPDATE Linea
	SET Nombre = @nombreProducto, TipoIvaId = @TipoIvaID, PrecioFinal = @Precio
	WHERE ID = @LineaID

END
GO


INSERT INTO TipoIva(Names, PorcentajeIva) VALUES ('Normal', 21)
INSERT INTO TipoIva(Names, PorcentajeIva) VALUES ('Reducido', 10)

INSERT INTO Articulo(Names, TipoIvaId, PrecioFinal, Sells) 
	VALUES ('Cafe', 1, 1.40, 0)
INSERT INTO Article(Names, TipoIvaId, PrecioFinal, Sells) 
	VALUES ('Cafe con leche', 1, 1.70, 0)
INSERT INTO Article(Names, TipoIvaId, PrecioFinal, Sells) 
	VALUES ('Bocata', 1, 3, 0)
INSERT INTO Article(Names, TipoIvaId, PrecioFinal, Sells) 
	VALUES ('Croissant', 2, 2.20, 0)
INSERT INTO Article(Names, TipoIvaId, PrecioFinal, Sells) 
	VALUES ('Ensalada se pasta', 1,4.50, 0)

INSERT INTO Mesa(Nombre)
	VALUES ('Mesa 1')
INSERT INTO Mesa(Nombre)
	VALUES ('Mesa 2')
INSERT INTO Mesa(Nombre)
	VALUES ('Mesa 3')
INSERT INTO Mesa(Nombre)
	VALUES ('Mesa 4')
INSERT INTO Mesa(Nombre)
	VALUES ('Mesa 5')

INSERT INTO Ticket(MesaId)
	VALUES (1)
INSERT INTO Ticket(MesaId)
	VALUES (2)
INSERT INTO Ticket(MesaId)
	VALUES (3)
INSERT INTO Ticket(MesaId)
	VALUES (4)
INSERT INTO Ticket(MesaId)
	VALUES (5)

INSERT INTO Linea(TicketId, ArticleId, Names, TipoIvaId, PrecioFinal, Stoks)
	VALUES (1, 1, 'h', 1, 1, 3)
INSERT INTO Linea(TicketId, ArticleId, Names, TipoIvaId, PrecioFinal, Stoks)
	VALUES (2, 3, 'h', 1, 1, 4)
INSERT INTO Linea(TicketId, ArticleId, Names, TipoIvaId, PrecioFinal, Stoks)
	VALUES (1, 4, 'h', 1, 1, 1)
INSERT INTO Linea(TicketId, ArticleId, Names, TipoIvaId, PrecioFinal, Stoks)
	VALUES (3, 1, 'h', 1, 1, 1)
INSERT INTO Linea(TicketId, ArticleId, Names, TipoIvaId, PrecioFinal, Stoks)
	VALUES (3, 2, 'h', 1, 1, 1)
