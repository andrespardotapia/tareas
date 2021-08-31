-- Database: tareas

-- DROP DATABASE tareas;

CREATE DATABASE tareas
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Chile.1252'
    LC_CTYPE = 'Spanish_Chile.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

    -- Table: public.tarea

    -- DROP TABLE public.tarea;

    CREATE TABLE IF NOT EXISTS public.tarea
    (
        id_tarea integer NOT NULL,
        descripcion character varying(50) COLLATE pg_catalog."default",
        fecha_creacion timestamp without time zone,
        vigencia boolean,
        CONSTRAINT tarea_pkey PRIMARY KEY (id_tarea)
    )