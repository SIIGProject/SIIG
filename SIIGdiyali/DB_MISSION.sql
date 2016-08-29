/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  21/04/2014 15:35:22                      */
/*==============================================================*/


drop table if exists Account;

drop table if exists Destination;

drop table if exists DetailMission;

drop table if exists Entite;

drop table if exists MembreEquipe;

drop table if exists Mission;

drop table if exists MissionPj;

drop table if exists Profil;

drop table if exists RelaisMission;

drop table if exists TypeMission;

drop table if exists User;

drop table if exists Ville;

/*==============================================================*/
/* Table : Account                                              */
/*==============================================================*/
create table Account
(
   idAccount            numeric(8,0) not null,
   idP                  numeric(8,0) not null,
   idUser               numeric(8,0) not null,
   login                varchar(254),
   pw                   varchar(254),
   primary key (idAccount)
);

/*==============================================================*/
/* Table : Destination                                          */
/*==============================================================*/
create table Destination
(
   idDestination        numeric(8,0) not null,
   idRelais             int not null,
   idEntite             numeric(8,0) not null,
   idVille              numeric(8,0) not null,
   description          varchar(254),
   primary key (idDestination)
);

/*==============================================================*/
/* Table : DetailMission                                        */
/*==============================================================*/
create table DetailMission
(
   idDetail             numeric(8,0) not null,
   idRelais             int not null,
   detail               longblob,
   primary key (idDetail)
);

/*==============================================================*/
/* Table : Entite                                               */
/*==============================================================*/
create table Entite
(
   idEntite             numeric(8,0) not null,
   idVille              numeric(8,0) not null,
   intitule             varchar(254),
   primary key (idEntite)
);

/*==============================================================*/
/* Table : MembreEquipe                                         */
/*==============================================================*/
create table MembreEquipe
(
   idMe                 numeric(8,0) not null,
   idUser               numeric(8,0) not null,
   idMission            numeric(8,0) not null,
   fonction             varchar(254),
   primary key (idMe)
);

/*==============================================================*/
/* Table : Mission                                              */
/*==============================================================*/
create table Mission
(
   idMission            numeric(8,0) not null,
   idRelais             int,
   titre                varchar(254),
   debut                datetime,
   fin                  datetime,
   objet                varchar(254),
   etat                 varchar(254),
   primary key (idMission)
);

/*==============================================================*/
/* Table : MissionPj                                            */
/*==============================================================*/
create table MissionPj
(
   idPj                 numeric(8,0) not null,
   idRelais             int not null,
   titre                varchar(254),
   type                 varchar(254),
   description          varchar(254),
   pj                   longblob,
   primary key (idPj)
);

/*==============================================================*/
/* Table : Profil                                               */
/*==============================================================*/
create table Profil
(
   idP                  numeric(8,0) not null,
   code                 varchar(254),
   libelle              varchar(254),
   primary key (idP)
);

/*==============================================================*/
/* Table : RelaisMission                                        */
/*==============================================================*/
create table RelaisMission
(
   idRelais             int not null,
   idMission            numeric(8,0) not null,
   idDetail             numeric(8,0),
   idType               numeric(8,0),
   primary key (idRelais)
);

/*==============================================================*/
/* Table : TypeMission                                          */
/*==============================================================*/
create table TypeMission
(
   idType               numeric(8,0) not null,
   idRelais             int not null,
   type                 varchar(254),
   description          varchar(254),
   primary key (idType)
);

/*==============================================================*/
/* Table : User                                                 */
/*==============================================================*/
create table User
(
   idUser               numeric(8,0) not null,
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
   idVille              numeric(8,0) not null,
   intitule             varchar(254),
   primary key (idVille)
);

alter table Account add constraint FK_association12 foreign key (idUser)
      references User (idUser) on delete restrict on update restrict;

alter table Account add constraint FK_association8 foreign key (idP)
      references Profil (idP) on delete restrict on update restrict;

alter table Destination add constraint FK_association13 foreign key (idVille)
      references Ville (idVille) on delete restrict on update restrict;

alter table Destination add constraint FK_association14 foreign key (idEntite)
      references Entite (idEntite) on delete restrict on update restrict;

alter table Destination add constraint FK_association2 foreign key (idRelais)
      references RelaisMission (idRelais) on delete restrict on update restrict;

alter table DetailMission add constraint FK_association5 foreign key (idRelais)
      references RelaisMission (idRelais) on delete restrict on update restrict;

alter table Entite add constraint FK_association9 foreign key (idVille)
      references Ville (idVille) on delete restrict on update restrict;

alter table MembreEquipe add constraint FK_association10 foreign key (idMission)
      references Mission (idMission) on delete restrict on update restrict;

alter table MembreEquipe add constraint FK_association11 foreign key (idUser)
      references User (idUser) on delete restrict on update restrict;

alter table Mission add constraint FK_association1 foreign key (idRelais)
      references RelaisMission (idRelais) on delete restrict on update restrict;

alter table MissionPj add constraint FK_association3 foreign key (idRelais)
      references RelaisMission (idRelais) on delete restrict on update restrict;

alter table RelaisMission add constraint FK_association1 foreign key (idMission)
      references Mission (idMission) on delete restrict on update restrict;

alter table RelaisMission add constraint FK_association4 foreign key (idType)
      references TypeMission (idType) on delete restrict on update restrict;

alter table RelaisMission add constraint FK_association5 foreign key (idDetail)
      references DetailMission (idDetail) on delete restrict on update restrict;

alter table TypeMission add constraint FK_association4 foreign key (idRelais)
      references RelaisMission (idRelais) on delete restrict on update restrict;

