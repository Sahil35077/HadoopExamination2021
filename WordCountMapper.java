import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable,  Text, Text, IntWritable>

{
protected void map(LongWritable key, Text value,org.apache.hadoop.mapreduce.Mapper.Context context)
			throws IOException, InterruptedException {
String inputstring = value.toString();

for(String x : inputstring.split(" ")){
		if (x.equals("Apple") || x.equals("Banana") || x.equals("Grapes")){
			context.write(new Text(x),new IntWritable(1));
			}
		}
	}

}
