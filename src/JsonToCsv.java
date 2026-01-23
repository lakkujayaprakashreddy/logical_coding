//import java.io.File;
//import java.io.FileWriter;
//import java.util.Iterator;
//
//
//public class JsonToCsv {
//
//    public static void main(String[] args) {
//        String inputJsonFile="input.json";
//        String outputCsvFile="output.csv";
//        ObjectMapper mapper=new ObjectMapper();
//        try {
//           JsonNode jsonArray= mapper.readTree(new File(inputJsonFile));
//           if(!jsonArray.isArray() && jsonArray.isEmpty()){
//               System.out.println("Invalid or Empty Json Array");
//               return;
//           }
//           FileWriter csvWriter=new FileWriter(outputCsvFile);
//           JsonNode firstObject=jsonArray.get(0);
//           Iterator<String> fieldNames= firstObject.fieldNames();
//           while(fieldNames.hasNext()){
//               csvWriter.append(fieldNames.next());
//               if(fieldNames.hasNext()){
//                   csvWriter.append(",");
//               }
//               System.out.println("/n");
//           }
//           for(JsonNode obj:jsonArray){
//               Iterator<JsonNode> values=obj.elements();
//               while(values.hasNext()){
//                   csvWriter.append(values.next());
//                   if(values.hasNext()){
//                       csvWriter.append(",");
//                   }
//               }
//               csvWriter.append("\n");
//           }
//           csvWriter.flush();
//           csvWriter.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
