/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  18/07/2014 14:10:01                      */
/*==============================================================*/


drop table if exists Consultation;

drop table if exists Document;

drop table if exists TypeDoc;

/*==============================================================*/
/* Table : Consultation                                         */
/*==============================================================*/
create table Consultation
(
   idConsultation       int not null,
   idUser               int not null,
   idDoc                int not null,
   dateConsultation     datetime,
   primary key (idConsultation)
);

/*==============================================================*/
/* Table : Document                                             */
/*==============================================================*/
create table Document
(
   idDoc                int not null,
   idType               int not null,
   titre                varchar(254),
   dateAjout            datetime,
   description          varchar(254),
   doc                  longblob,
   primary key (idDoc)
);

/*==============================================================*/
/* Table : TypeDoc                                              */
/*==============================================================*/
create table TypeDoc
(
   idType               int not null,
   libelle              varchar(254),
   description          varchar(254),
   primary key (idType)
);

alter table Consultation add constraint FK_association2 foreign key (idDoc)
      references Document (idDoc) on delete restrict on update restrict;

alter table Consultation add constraint FK_association3 foreign key (idUser)
      references User (idUser) on delete restrict on update restrict;

alter table Document add constraint FK_association1 foreign key (idType)
      references TypeDoc (idType) on delete restrict on update restrict;

