/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  16/07/2014 11:05:26                      */
/*==============================================================*/


/*==============================================================*/
/* Table : Account                                              */
/*==============================================================*/
create table Account
(
   idAccount            int not null,
   idP                  int not null,
   idUser               int not null,
   login                varchar(254),
   pw                   varchar(254),
   primary key (idAccount)
);

/*==============================================================*/
/* Table : Destination                                          */
/*==============================================================*/
create table Destination
(
   idDestination        int not null,
   idEntite             int not null,
   idVille              int not null,
   idMission            int not null,
   description          varchar(254),
   primary key (idDestination)
);

/*==============================================================*/
/* Table : Entite                                               */
/*==============================================================*/
create table Entite
(
   idEntite             int not null,
   idVille              int not null,
   intitule             varchar(254),
   primary key (idEntite)
);

/*==============================================================*/
/* Table : MembreEquipe                                         */
/*==============================================================*/
create table MembreEquipe
(
   idMe                 int not null,
   idUser               int not null,
   idMission            int not null,
   fonction             varchar(254),
   primary key (idMe)
);

/*==============================================================*/
/* Table : Mission                                              */
/*==============================================================*/
create table Mission
(
   idMission            int not null,
   idType               int,
   titre                varchar(254),
   debut                datetime,
   fin                  datetime,
   objet                varchar(254),
   detail               varchar(254),
   etat                 varchar(254),
   primary key (idMission)
);

/*==============================================================*/
/* Table : MissionPj                                            */
/*==============================================================*/
create table MissionPj
(
   idPj                 int not null,
   idType               int not null,
   idMission            int not null,
   titre                varchar(254),
   dateAjout            datetime,
   description          varchar(254),
   primary key (idPj)
);

/*==============================================================*/
/* Table : Profil                                               */
/*==============================================================*/
create table Profil
(
   idP                  int not null,
   code                 varchar(254),
   libelle              varchar(254),
   primary key (idP)
);

/*==============================================================*/
/* Table : Element                                              */
/*==============================================================*/
create table Element
(
   idElement            int not null,
   idModule             int not null,
   code                 int,
   libelle              varchar(254),
   primary key (idElement)
);

/*==============================================================*/
/* Table : Fonction                                             */
/*==============================================================*/
create table Fonction
(
   idFonction           int not null,
   idElement            int not null,
   code                 int,
   libelle              varchar(254),
   primary key (idFonction)
);

/*==============================================================*/
/* Table : Module                                               */
/*==============================================================*/
create table Module
(
   idModule             int not null,
   code                 int,
   libelle              varchar(254),
   primary key (idModule)
);


/*==============================================================*/
/* Table : TypeMission                                          */
/*==============================================================*/
create table TypeMission
(
   idType               int not null,
   type                 varchar(254),
   description          varchar(254),
   primary key (idType)
);

/*==============================================================*/
/* Table : TypePj                                               */
/*==============================================================*/
create table TypePj
(
   idType               int not null,
   type                 varchar(254),
   description          varchar(254),
   primary key (idType)
);

/*==============================================================*/
/* Table : User                                                 */
/*==============================================================*/
create table User
(
   idUser               int not null,
   ppr                  numeric(8,0),
   cin                  varchar(254),
   nom                  varchar(254),
   prenom               varchar(254),
   primary key (idUser)
);

/*==============================================================*/
/* Table : Ville                                                */
/*==============================================================*/
create table Ville
(
   idVille              int not null,
   intitule             varchar(254),
   primary key (idVille)
);

/*==============================================================*/
/* Table : ProfilModule                                         */
/*==============================================================*/
create table ProfilModule
(
   idModule             int not null,
   idP                  int not null,
   primary key (idModule, idP)
);

alter table Account add constraint FK_association12 foreign key (idUser)
      references User (idUser) on delete restrict on update restrict;

alter table Account add constraint FK_association8 foreign key (idP)
      references Profil (idP) on delete restrict on update restrict;

alter table Destination add constraint FK_association13 foreign key (idVille)
      references Ville (idVille) on delete restrict on update restrict;

alter table Destination add constraint FK_association14 foreign key (idEntite)
      references Entite (idEntite) on delete restrict on update restrict;

alter table Destination add constraint FK_association15 foreign key (idMission)
      references Mission (idMission) on delete restrict on update restrict;

alter table Entite add constraint FK_association9 foreign key (idVille)
      references Ville (idVille) on delete restrict on update restrict;

alter table MembreEquipe add constraint FK_association10 foreign key (idMission)
      references Mission (idMission) on delete restrict on update restrict;

alter table MembreEquipe add constraint FK_association11 foreign key (idUser)
      references User (idUser) on delete restrict on update restrict;

alter table Mission add constraint FK_association17 foreign key (idType)
      references TypeMission (idType) on delete restrict on update restrict;

alter table MissionPj add constraint FK_association16 foreign key (idMission)
      references Mission (idMission) on delete restrict on update restrict;

alter table MissionPj add constraint FK_association18 foreign key (idType)
      references TypePj (idType) on delete restrict on update restrict;
	  
--------------------------------------------------------------------------

alter table Account add constraint FK_association121 foreign key (idUser)
      references User (idUser) on delete restrict on update restrict;

alter table Account add constraint FK_association81 foreign key (idP)
      references Profil (idP) on delete restrict on update restrict;

alter table Element add constraint FK_association41 foreign key (idModule)
      references Module (idModule) on delete restrict on update restrict;

alter table Fonction add constraint FK_association51 foreign key (idElement)
      references Element (idElement) on delete restrict on update restrict;

alter table ProfilModule add constraint FK_association31 foreign key (idModule)
      references Module (idModule) on delete restrict on update restrict;

alter table ProfilModule add constraint FK_association311 foreign key (idP)
      references Profil (idP) on delete restrict on update restrict;



