DROP TABLE IF EXISTS "book";
DROP TABLE IF EXISTS "author";

CREATE TABLE "public"."book"
(
    "id"                    character varying(36) PRIMARY KEY,
    "name"                  character varying(36) NOT NULL,
    "page_count"            int,
    "author_id"             character varying(36)
);

CREATE TABLE "public"."author"
(
    "id"            character varying(36) PRIMARY KEY,
    "first_name"    character varying(36) NOT NULL,
    "last_name"     character varying(36) NOT NULL
);