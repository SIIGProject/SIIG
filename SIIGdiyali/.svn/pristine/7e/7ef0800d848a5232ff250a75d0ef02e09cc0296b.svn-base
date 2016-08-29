/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  17/07/2014 12:21:10                      */
/*==============================================================*/


drop table if exists Document;

drop table if exists TypeDoc;

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

alter table Document add constraint FK_association1 foreign key (idType)
      references TypeDoc (idType) on delete restrict on update restrict;

