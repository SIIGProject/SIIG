/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  07/08/2014 14:45:36                      */
/*==============================================================*/


drop table if exists Account;

drop table if exists Element;

drop table if exists Fonction;

drop table if exists Module;

drop table if exists Profil;

drop table if exists User;

drop table if exists association3;

/*==============================================================*/
/* Table : Account                                              */
/*==============================================================*/
create table Account
(
   idAccount            int not null,
   idUser               int not null,
   idP                  int not null,
   login                varchar(254),
   pw                   varchar(254),
   primary key (idAccount)
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
/* Table : association3                                         */
/*==============================================================*/
create table association3
(
   idModule             int not null,
   idP                  int not null,
   primary key (idModule, idP)
);

alter table Account add constraint FK_association12 foreign key (idUser)
      references User (idUser) on delete restrict on update restrict;

alter table Account add constraint FK_association8 foreign key (idP)
      references Profil (idP) on delete restrict on update restrict;

alter table Element add constraint FK_association4 foreign key (idModule)
      references Module (idModule) on delete restrict on update restrict;

alter table Fonction add constraint FK_association5 foreign key (idElement)
      references Element (idElement) on delete restrict on update restrict;

alter table association3 add constraint FK_association3 foreign key (idModule)
      references Module (idModule) on delete restrict on update restrict;

alter table association3 add constraint FK_association3 foreign key (idP)
      references Profil (idP) on delete restrict on update restrict;

