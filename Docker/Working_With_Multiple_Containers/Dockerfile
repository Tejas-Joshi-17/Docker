FROM python

WORKDIR /myapp

COPY ./client.py .

RUN pip install pymysql
RUN pip install cryptography

CMD python client.py