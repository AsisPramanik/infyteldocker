FROM mysql
COPY ./infytel_microservices_table_script.sql /docker-entrypoint-initdb.d/infytel_microservices_table_script.sql