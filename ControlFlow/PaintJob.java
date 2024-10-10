package ControlFlow;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets < 0) {
            return -1;

        }
        double area = height * width;
        double bucketCount = Math.ceil((area / areaPerBucket) - extraBuckets);

        System.out.println(bucketCount);
        return (int) Math.ceil(bucketCount);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) {
            return -1;

        }
        double area = height * width;
        double bucketCount = area / areaPerBucket;

        return (int) Math.ceil(bucketCount);

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0.0 || areaPerBucket <= 0.0) {
            return -1;

        }
        double bucketCount = area / areaPerBucket;

        return (int) Math.ceil(bucketCount);

    }
}
