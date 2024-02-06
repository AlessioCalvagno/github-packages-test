package it.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MeanUtils {
    private static final Logger log = LoggerFactory.getLogger(MeanUtils.class);

    public static Float computeMean(List<Float> arr) {
        log.info("Computing mean for: {}", arr);
        Float sum = (float) 0;

        for(Float n: arr) {
            sum += n;
        }
        log.info("Mean value = {}", sum/arr.size());
        return sum/arr.size();
    }

    public static Float computeMeanForInt(List<Integer> arr) {
        log.info("Computing mean for: {}", arr);
        Float sum = (float) 0;

        for(Integer n: arr) {
            sum += n;
        }
        log.info("Mean value = {}", sum/arr.size());
        return sum/arr.size();
    }
}
