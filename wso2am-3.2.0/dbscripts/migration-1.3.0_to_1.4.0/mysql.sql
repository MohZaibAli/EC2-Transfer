CREATE TABLE IF NOT EXISTS AM_API_COMMENTS (
    COMMENT_ID INTEGER AUTO_INCREMENT,
    COMMENT_TEXT VARCHAR(512),
    COMMENTED_USER VARCHAR(255),
    DATE_COMMENTED TIMESTAMP NOT NULL,
    API_ID INTEGER NOT NULL,
    FOREIGN KEY(API_ID) REFERENCES AM_API(API_ID) ON UPDATE CASCADE ON DELETE RESTRICT,
    PRIMARY KEY (COMMENT_ID)
)ENGINE INNODB;

CREATE TABLE IF NOT EXISTS AM_API_RATINGS (
    RATING_ID INTEGER AUTO_INCREMENT,
    API_ID INTEGER,
    RATING INTEGER,
    SUBSCRIBER_ID INTEGER,
    FOREIGN KEY(API_ID) REFERENCES AM_API(API_ID) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY(SUBSCRIBER_ID) REFERENCES AM_SUBSCRIBER(SUBSCRIBER_ID) ON UPDATE CASCADE ON DELETE RESTRICT,
PRIMARY KEY (RATING_ID)
)ENGINE INNODB;

CREATE TABLE AM_APP_KEY_DOMAIN_MAPPING (
CONSUMER_KEY VARCHAR(255),
AUTHZ_DOMAIN VARCHAR(255) DEFAULT 'ALL',
PRIMARY KEY (CONSUMER_KEY,AUTHZ_DOMAIN),
FOREIGN KEY (CONSUMER_KEY) REFERENCES IDN_OAUTH_CONSUMER_APPS(CONSUMER_KEY)
)ENGINE INNODB;

INSERT INTO AM_APP_KEY_DOMAIN_MAPPING(CONSUMER_KEY,AUTHZ_DOMAIN)
SELECT CONSUMER_KEY, "ALL" as new_val
FROM IDN_OAUTH_CONSUMER_APPS;

ALTER TABLE `AM_APPLICATION` ADD COLUMN `CALLBACK_URL` VARCHAR(512)  AFTER `APPLICATION_TIER`;

ALTER TABLE AM_SUBSCRIPTION  ADD SUB_STATUS VARCHAR(50) DEFAULT 'UNBLOCKED' NOT NULL