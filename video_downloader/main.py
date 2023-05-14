from pytube import YouTube

from pytube import YouTube

def download_video(url, output_path):
    yt = YouTube(url)
    print(yt)
    stream = yt.streams.first()
    print(stream)
    stream.download(output_path)

if __name__ == "__main__":
    import sys
    url = sys.argv[1]
    output_path = sys.argv[2]
    download_video(url, output_path)
