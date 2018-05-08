import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class Map extends MapReduceBase implements org.apache.hadoop.mapred.Mapper<LongWritable,Text,Text,IntWritable> {
    @Override
    public void map(LongWritable longWritable, Text text, OutputCollector<Text, IntWritable> outputCollector, Reporter reporter) throws IOException {
        String[] words = text.toString().split(" ");
        outputCollector.collect(new Text(words[2]),new IntWritable(1));
    }

}
