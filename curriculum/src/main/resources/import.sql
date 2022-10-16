INSERT INTO users ( name, phone, birth_date, email, github, linkedin, image_profile_url) VALUES ( 'daniel izidio de lima', '(11) 99999-1234', '2000-12-31 12:43:43', 'daniel.izidioparacontato@gmail.com', 'https://github.com/izidiozz', 'https://www.linkedin.com/in/daniel-izidio', 'https://avatars.githubusercontent.com/u/37378515' )

INSERT INTO KNOWLEDGES ( KNOWLEDGE , USER_ID ) VALUES ('Java',1) 
INSERT INTO KNOWLEDGES ( KNOWLEDGE , USER_ID ) VALUES ('Desenvolvimento web',1) 
INSERT INTO KNOWLEDGES ( KNOWLEDGE , USER_ID ) VALUES ('C#',1) 
INSERT INTO KNOWLEDGES ( KNOWLEDGE , USER_ID ) VALUES ('PHP',1) 
INSERT INTO KNOWLEDGES ( KNOWLEDGE , USER_ID ) VALUES ('CSS',1)
INSERT INTO KNOWLEDGES ( KNOWLEDGE , USER_ID ) VALUES ('HTML',1)
INSERT INTO KNOWLEDGES ( KNOWLEDGE , USER_ID ) VALUES ('Javascript',1)
INSERT INTO KNOWLEDGES ( KNOWLEDGE , USER_ID ) VALUES ('Ruby',1)

INSERT INTO PROFESSIONAL_EXPERIENCES ( COMPANY , ROLE , WORKING_TIME ,USER_ID) VALUES ('Adega Alentejana', 'Desenvolvedor Pleno', 'De 2020 até 2021', 1)
INSERT INTO PROFESSIONAL_EXPERIENCES ( COMPANY , ROLE , WORKING_TIME ,USER_ID) VALUES ('Rock Content', 'Desenvolvedor .Net Pleno', 'Desde dezembro 2021', 1)

INSERT INTO ACADEMIC_EDUCATIONS ( TITLE, EDUCATION_INSTITUTION , USER_ID ) VALUES ('Técnico em Desenvolvimento de Sistemas','Senai Ary Torres', 1)
INSERT INTO ACADEMIC_EDUCATIONS ( TITLE, EDUCATION_INSTITUTION , USER_ID ) VALUES ('Tecnólogo em Analise e Desenvolvimento de Sistemas','Centro Universitário Senac', 1)

INSERT INTO LANGUAGE_PROFICIENCIES ( LANGUAGE , READING , SPEAKING , WRITING , USER_ID ) VALUES ('Português','Nativo','Nativo','Nativo', 1)
INSERT INTO LANGUAGE_PROFICIENCIES ( LANGUAGE , READING , SPEAKING , WRITING , USER_ID ) VALUES ('Ingles','Avançado','Bom','Bom', 1)
INSERT INTO LANGUAGE_PROFICIENCIES ( LANGUAGE , READING , SPEAKING , WRITING , USER_ID ) VALUES ('Espanhol','Básico','Básico','Básico', 1)
