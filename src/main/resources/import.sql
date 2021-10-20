insert into public.user (id, countrycode, createdat, dateofbirth, imageurl, name, surname)
values  (nextval('hibernate_sequence'), 'ZA', '2021-10-15', '2021-10-15', 'google.com', 'Ighsaan', 'Levy');
insert into public.user (id, countrycode, createdat, dateofbirth, imageurl, name, surname)
values  (nextval('hibernate_sequence'), 'ZA', '2021-10-13', '2012-10-15', 'google.com', 'Other', 'User');
insert into public.user (id, countrycode, createdat, dateofbirth, imageurl, name, surname)
values  (nextval('hibernate_sequence'), 'ZA', '2021-10-12', '2014-10-15', 'google.com', 'Test', 'User');


insert into public.organization (id, name, summary, description, imageurl, countryCode, createdat)
values  (nextval('hibernate_sequence'), 'Intel Corp', 'Hardware Comparny', 'This is a summary of a company', 'google.com', 'ZA', '2014-10-15');

insert into public.organizationuser (organizationid, userid)
values (4, 1);