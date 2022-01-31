CREATE DATABASE SpotifyDataBase;

CREATE TABLE Usuarios (
    id int NOT NULL UNIQUE PRIMARY KEY;
    nick nvarchar(50) NOT NULL UNIQUE;
    contraseña nvarchar(50) NOT NULL;
    correo nvarchar(50) NOT NULL UNIQUE;
    premium bit;
    registro datetime NOT NULL;
);

CREATE TABLE Artista (
    id int NOT NULL UNIQUE PRIMARY KEY;
    nombre nvarchar(50) NOT NULL;
    apellido nvarchar(50) NOT NULL;
    verificado bit;
);

CREATE TABLE Canciones (
    id int NOT NULL UNIQUE PRIMARY KEY;
    nombre nvarchar(50) NOT NULL;
    duración time NOT NULL;
    FOREIGN KEY (ArtistaID) REFERENCES Artista(id);
    FOREIGN KEY (GeneroID) REFERENCES Genero(id);
    FOREIGN KEY (IdiomaID) REFERENCES Idiomas(id);
);

CREATE TABLE Idiomas(
    id int NOT NULL;
    Idiomas nvarchar(50) NOT NULL;
)

CREATE TABLE Álbum (
    id int NOT NULL UNIQUE PRIMARY KEY;
    Nombre nvarchar(50) NOT NULL;
    FOREIGN KEY (ArtistaID) REFERENCES Artista(id);
    FOREIGN KEY (GeneroID) REFERENCES Genero(id);
);

CREATE TABLE Canción Álbum(
    FOREIGN KEY (CanciónID) REFERENCES Canciones(id);
    FOREIGN KEY (AlbumID) REFERENCES Álbum(id);
);

CREATE TABLE Genero(
    id int NOT NULL UNIQUE PRIMARY KEY;
    genero nvarchar(50) NOT NULL;
);

CREATE TABLE Playlist(
    id int NOT NULL UNIQUE PRIMARY KEY;
    FOREIGN KEY (UsuarioID) REFERENCES Usuarios(id);
);

CREATE TABLE Canciones Playlist(
    FOREIGN KEY (CanciónID) REFERENCES Canciones(id);
    FOREIGN KEY (PlaylistID) REFERENCES Playlist(id);
);