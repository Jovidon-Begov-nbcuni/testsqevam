package vamservice.Pojo;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.Arrays;


public class JasonToAvro {

    public static void main(String[] args) throws Exception {

        String json = "{\n" +
                "\t\"username\": \"miguno\",\n" +
                "\t\"tweet\": \"Rock: Nerf paper, scissors is fine.\",\n" +
                "\t\"timestamp\": 1366150681\n" +
                "}";
        String schemastr ="{\n" +
                "\t\"type\": \"record\",\n" +
                "\t\"name\": \"twitter_schema\",\n" +
                "\t\"namespace\": \"com.miguno.avro\",\n" +
                "\t\"fields\": [{\n" +
                "\t\t\"name\": \"username\",\n" +
                "\t\t\"type\": \"string\",\n" +
                "\t\t\"doc\": \"Name of the user account on Twitter.com\"\n" +
                "\t}, {\n" +
                "\t\t\"name\": \"tweet\",\n" +
                "\t\t\"type\": \"string\",\n" +
                "\t\t\"doc\": \"The content of the user's Twitter message\"\n" +
                "\t}, {\n" +
                "\t\t\"name\": \"timestamp\",\n" +
                "\t\t\"type\": \"long\",\n" +
                "\t\t\"doc\": \"Unix epoch time in seconds\"\n" +
                "\t}],\n" +
                "\t\"doc:\": \"A basic schema for storing Twitter messages\"\n" +
                "}";

        byte[] avroByteArray = fromJasonToAvro(json,schemastr);


        Schema schema = Schema.parse(schemastr);
        DatumReader<GenericRecord> reader1 = new GenericDatumReader<>(schema);

        Decoder decoder1 = DecoderFactory.get().binaryDecoder(avroByteArray, null);
        GenericRecord result = reader1.read(null, decoder1);
        System.out.println(result);



    }


    public static byte[] fromJasonToAvro(String json, String schemastr) throws Exception {

        InputStream input = new ByteArrayInputStream(json.getBytes());
        DataInputStream din = new DataInputStream(input);

        Schema schema = Schema.parse(schemastr);

        Decoder decoder = DecoderFactory.get().jsonDecoder(schema, din);

        DatumReader<Object> reader = new GenericDatumReader<>(schema);
        Object datum = reader.read(null, decoder);


        GenericDatumWriter<Object>  w = new GenericDatumWriter<>(schema);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        Encoder e = EncoderFactory.get().binaryEncoder(outputStream, null);

        w.write(datum, e);
        e.flush();

        return outputStream.toByteArray();
    }
}