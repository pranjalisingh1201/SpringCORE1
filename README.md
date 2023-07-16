"# SpringCORE1" 
1)Bean Factory Implementations with XmlBeanFactory:
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/7f474524-54c6-432e-a69b-6c8767ba9dd9)
2)XML BEAN Configurations:
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/12c8b9c3-abd6-4246-9e0a-278cbed43b18)
3)Alien class:
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/18478347-9978-43e5-b5e8-bbd571362035)
4)Pom File Configurations:
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/f5562c36-5a0d-4b3e-9de5-3aeb32ab3821)
5)After changing the deprecated part:
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/f6a1d27b-a960-477b-a4be-ba722a3daa9a)


1) Understanding Spring Container: A special container in JRE where it stores all spring Beans.
2) Spring Beans are any objects or variables of Java classes having getters and setter methods.
3) These Spring Beans are created only once by the JRE ---> called Singleton.
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/cc8c53cc-26ea-44c9-91cf-180ee2b70f7a)
4) ApplicationContext creates all the beans present in Sping.xml.
5) Alien Object is created only once and reused. Obj1 and Obj2 are pointing to the same object.
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/5a3ee4a9-3ca1-4515-9de0-c27102ef7ff5)
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/2f24299b-ff65-4154-a823-5a8fb79183da)

What if we need more beans?
1) For this we have an attribute scope. scope ="singleton" returns the same object whenever a new bean is required.
2) For Multiple beans we need to change the scope to "prototype".
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/f16fe7d5-abf5-49b9-8190-64a915a8ca2c)
3) If we use "prototype" as a scope we will not receive a bean until we ask for it.
4) By default if we use singleton as a scope then ApplicationContext will create all the beans present in xml file before we ask for it.
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/b502e122-2956-4ffb-ac8a-2b5b63a56ef3)

Setters and Getters for Class Variables for Primitive Data Types:
1)![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/d88224f8-090e-48d0-9658-daeb7acda12a)
2) Right-click on age --> Source --> Generate Getters and Setters.
![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/579ef064-9613-44da-b465-545f4b8f4194)
3)![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/c0f52ffc-3d8a-4e92-9de0-0398106badb1)

Setters and Getters for Object / Reference types:
1) ![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/4d7af845-f3de-40ed-84ca-ffa08ff0de49)
2) ![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/ec531cfb-0bab-4bfc-a552-ff290004e81c)
3) ![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/f0af6952-6fed-45e6-8cfc-e3105076edad)
4) ![image](https://github.com/pranjalisingh1201/SpringCORE1/assets/75729195/67653bb3-4f6e-48eb-913d-81def088a1a7)




