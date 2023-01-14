IF NOT  EXISTS (SELECT * FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'[DBO].[AM_API_CATEGORIES]') AND TYPE IN (N'U'))
CREATE TABLE AM_API_CATEGORIES (
  UUID VARCHAR(50),
  NAME VARCHAR(255),
  DESCRIPTION VARCHAR(1024),
  TENANT_ID INTEGER DEFAULT -1,
  UNIQUE (NAME,TENANT_ID),
  PRIMARY KEY (UUID)
);

ALTER TABLE AM_SYSTEM_APPS
ADD TENANT_DOMAIN VARCHAR(255) DEFAULT 'carbon.super';

IF NOT  EXISTS (SELECT * FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'[DBO].[AM_USER]') AND TYPE IN (N'U'))
CREATE TABLE AM_USER (
  USER_ID VARCHAR(255) NOT NULL,
  USER_NAME VARCHAR(255) NOT NULL,
  PRIMARY KEY(USER_ID)
);

IF NOT  EXISTS (SELECT * FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'[DBO].[AM_SECURITY_AUDIT_UUID_MAPPING]') AND TYPE IN (N'U'))
CREATE TABLE AM_SECURITY_AUDIT_UUID_MAPPING (
    API_ID INTEGER NOT NULL,
    AUDIT_UUID VARCHAR(255) NOT NULL,
    PRIMARY KEY (API_ID),
    FOREIGN KEY (API_ID) REFERENCES AM_API(API_ID);