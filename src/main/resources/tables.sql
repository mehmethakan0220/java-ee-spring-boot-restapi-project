CREATE TABLE IF NOT EXISTS blog_category (
	id SERIAL 			PRIMARY KEY,
	title 				VARCHAR(50)	  UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS role(
	id SERIAL 			PRIMARY KEY,
	title 				VARCHAR(30)   UNIQUE NOT NULL,
	mean 				VARCHAR(100)  UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS users (
	id UUID 			PRIMARY KEY,
	role_id 			INTEGER				 NOT NULL,
	full_name 			VARCHAR(100)   		 NOT NULL,
	nick 				VARCHAR(10)   UNIQUE NOT NULL,
	email 				VARCHAR(50)   UNIQUE NOT NULL,
	dob 				DATE				 NOT NULL,
	location 			VARCHAR(100)    	 NOT NULL,
	CONSTRAINT fk_role
		FOREIGN KEY (role_id)
			REFERENCES role(id)
);

CREATE TABLE IF NOT EXISTS blog (
	id SERIAL 			PRIMARY KEY,
	blog_user_id 		UUID		 		  NOT NULL,
	blog_title 			VARCHAR(150)   UNIQUE NOT NULL,
	blog_category 		VARCHAR(100)		  NOT NULL,
	blog_content 		BYTEA  		   UNIQUE NOT NULL,
	blog_description 	VARCHAR(150)    	  NOT NULL,
	CONSTRAINT fk_blog_category
			FOREIGN KEY (blog_category)
				REFERENCES blog_category(title),
	CONSTRAINT fk_user
			FOREIGN KEY (blog_user_id)
				REFERENCES users(id)
);






