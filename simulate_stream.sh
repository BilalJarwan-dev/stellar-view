#!/bin/zsh
# Number of objects per chunk
CHUNK_SIZE=10

# csv file
TEMP_FILE="data/stellarobjects_temp.csv" 

# Split the CSV into chunks, skipping the header
tail -n +2 data/stellarobjects.csv | split -l $CHUNK_SIZE - data/stellarobjects_chunk_

# Add header to each chunk and move to streaming directory
for file in data/stellarobjects_chunk_*; do # Updated here
  echo "obj_ID,alpha,delta,u,g,r,i,z,run_ID,rerun_ID,cam_col,field_ID,spec_obj_ID,class,redshift,plate,MJD,fiber_ID" > $TEMP_FILE
  cat $file >> $TEMP_FILE
  mv $TEMP_FILE data/streaming/$(basename $file .txt).csv
  echo "Moved $(basename $file) to streaming directory."
  sleep 5 # Wait for 5 seconds before next chunk
done

# Clean up
rm data/stellarobjects_chunk_* 